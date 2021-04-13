package tech.cuda.hsrl.common.card.warlock.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class NightshadeMatron_56502 : Card() {
    override val id = 56502
    override val name = "夜影主母"
    override val description = "<b>突袭，战吼：</b> 弃掉你手牌中法力值消耗最高的牌。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.AshesOfOutland
    override val background = "总能给那些“高级”随从留下阴影。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/93951f5204739c19bc307e078767312cd5db74886f9f297f64bfc1e673b5b157.png"
}
