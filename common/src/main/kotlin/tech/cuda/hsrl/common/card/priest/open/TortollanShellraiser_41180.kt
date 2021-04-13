package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TortollanShellraiser_41180 : Card() {
    override val id = 41180
    override val name = "始祖龟执盾者"
    override val description = "<b>嘲讽，亡语：</b>随机使一个友方随从获得+1/+1。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.Ungoro
    override val background = "别看他现在拄着拐杖，年轻时可是大名鼎鼎的“乌龟队长”。"
    override val artist = "Garrett Hanna"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a7e4d104fb163e6ca8135a1192e1e43febb26029ae15eddc172a6944be9e1c89.png"
}
