package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class CryptLord_43025 : Card() {
    override val id = 43025
    override val name = "地穴领主"
    override val description = "<b>嘲讽</b> 在你召唤一个随从后，获得+1生命值。"
    override var cost: Int? = 3
    override var health: Int? = 6
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.Kotf
    override val background = "他曾是甲虫乐队的一员，效忠巫妖王后便隐退了。"
    override val artist = "Konstantin Turovec"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7e47289e70493849383953cfc5daead2a6e6417c21a0530be9961927929f4daf.png"
}
