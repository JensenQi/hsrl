package tech.cuda.hsrl.common.card.warrior.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ClockworkGoblin_51735 : Card() {
    override val id = 51735
    override val name = "发条地精"
    override val description = "<b>战吼：</b>将一张“炸弹” 牌洗入你对手的牌库。当玩家抽到“炸弹”时，便会受到5点伤害。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Warrior
    override val cardSet = CardSet.RiseOfShadows
    override val background = "有些人拧着拧着就炸了。"
    override val artist = "A.J. Nazzaro"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/410bc556dbafe71a3279ac49ee87f673e5584edb5abdbef6e8026ca87baff1b1.png"
}
