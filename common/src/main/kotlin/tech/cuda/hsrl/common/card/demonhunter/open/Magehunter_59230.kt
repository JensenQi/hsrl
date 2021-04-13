package tech.cuda.hsrl.common.card.demonhunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Magehunter_59230 : Card() {
    override val id = 59230
    override val name = "法师猎手"
    override val description = "<b>突袭</b> 每当该随从攻击一个随从时，将其<b>沉默</b>。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Demonhunter
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "奔袭如火。讨厌话多。喜欢紫色。"
    override val artist = "Dave Allsop"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3450424f803a00f292a6217bd95471ad5684931775854784e77e4fc81871137a.png"
}
