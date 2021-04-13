package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MetaltoothLeaper_2016 : Card() {
    override val id = 2016
    override val name = "金刚刃牙兽"
    override val description = "<b>战吼：</b>使你的其他机械获得+2攻击力。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Gvg
    override val background = "最好不要让它们淋雨。在安戈洛环型山，金刚锈牙兽的数量已经无法控制了。"
    override val artist = "Hideaki Takamura"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5c9a2f0501c35c6757dc0e80c09c13f2b791625ae447803262703479f828eaef.png"
}
