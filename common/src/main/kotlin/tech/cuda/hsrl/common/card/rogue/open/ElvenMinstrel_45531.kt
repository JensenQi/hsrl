package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ElvenMinstrel_45531 : Card() {
    override val id = 45531
    override val name = "精灵咏唱者"
    override val description = "<b>连击：</b>从你的牌库中抽两张随从牌。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "“自从魔笛手朝南方去了之后，我就再也没见过老鼠。”"
    override val artist = "Wayne Wu "
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1089951a0920d6dae97ae5cf83290c0fde63bb59fb194ed0295f546a076c34e0.png"
}
