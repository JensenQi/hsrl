package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TournamentAttendee_2499 : Card() {
    override val id = 2499
    override val name = "赛场观众"
    override val description = "<b>嘲讽</b>"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "他之所以如此兴奋，是因为买到了本年度锦标赛的季票。平时季票并不好买，他通常都是花费高价在食人魔票贩子那里收来的。"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2f4ace62dcca67e5f0146c72d1637f591c010fc1aab22ca2ee91272e6faafee0.png"
}
