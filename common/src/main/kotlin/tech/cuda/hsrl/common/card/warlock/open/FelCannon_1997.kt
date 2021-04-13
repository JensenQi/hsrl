package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FelCannon_1997 : Card() {
    override val id = 1997
    override val name = "邪能火炮"
    override val description = "在你的回合结束时，对一个非机械随从造成2点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.Gvg
    override val background = "包装盒上写着：全新改良，比旧款更邪门！"
    override val artist = "Matt Gaser"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3561809d74073bfae4e23f837c37ac737b99564a218573185fc55e3e315f38bd.png"
}
