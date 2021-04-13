package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SteamSurger_41154 : Card() {
    override val id = 41154
    override val name = "蒸汽涌动者"
    override val description = "<b>战吼：</b>如果你在上个回合使用过元素牌，将一张“烈焰喷涌”置入你的手牌。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Ungoro
    override val background = "身处野外的探险者会时不时地用他来泡茶。"
    override val artist = "Jakub Kasper"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ed3c7cea4e16d78a3ae9ecac949671b197cd9bd55ac8625163c67343f7fc2ab5.png"
}
