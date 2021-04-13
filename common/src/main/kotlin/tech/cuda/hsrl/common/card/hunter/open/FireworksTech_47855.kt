package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FireworksTech_47855 : Card() {
    override val id = 47855
    override val name = "烟火技师"
    override val description = "<b>战吼：</b>使一个友方机械获得+1/+1。如果它具有<b>亡语</b>，则将其 触发。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.BoomsdayProject
    override val background = "她会从试验和错误中吸取教训……好吧，主要是从错误。"
    override val artist = "Steve Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/48b104b7dfdbfaafe167dc349d8d95835cec514501e7c290ba3197e3cba53813.png"
}
