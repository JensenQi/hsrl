package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MadderBomber_2058 : Card() {
    override val id = 2058
    override val name = "疯狂爆破者"
    override val description = "<b>战吼：</b>造成6点伤害，随机分配到所有其他角色身上。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 5
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Gvg
    override val background = "如果你还在抱怨疯狂投弹者乱扔炸弹，你应该看看这位。"
    override val artist = "Alex Horley Orlandelli"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a85e68687c8e1ee05382731331dd2cf211987c0ce09e981552f14e8bc5a5863b.png"
}
