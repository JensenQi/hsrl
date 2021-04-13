package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class BlessingOfTheAncients_51779 : Card() {
    override val id = 51779
    override val name = "远古祝福"
    override val description = "<b>双生法术</b> 使你的所有随从获得+1/+1。"
    override var cost: Int? = 3
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.RiseOfShadows
    override val background = "可以说是最可爱的祝福了。"
    override val artist = "Steven Prescott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9a22be1f10d02fa084a30c30d7093530db3e8ce9fecb73e685ddd88e7a2aac19.png"
}
