package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SecretPassage_58794 : Card() {
    override val id = 58794
    override val name = "秘密通道"
    override val description = "将你的手牌替换为你牌库中的4张牌。下回合换回。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "到了夜里，我就用这条通道偷偷溜进厨房，做点黑暗料理。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f253ca80aea694d219cfc7089cd9ff8649fd497d5980978e1675f0994dae08a9.png"
}
