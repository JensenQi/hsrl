package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JewelOfNzoth_61690 : Card() {
    override val id = 61690
    override val name = "恩佐斯宝石"
    override val description = "召唤三个在本局对战中死亡的友方<b>亡语</b>随从。"
    override var cost: Int? = 8
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "宝石诱人，唤你摘获；牢笼落下，无计逃脱。"
    override val artist = "Ware Lee"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/664a33f82961ed952cfe4f8eb274485a9440f878d0015a3558e74455bb9ac6b3.png"
}
