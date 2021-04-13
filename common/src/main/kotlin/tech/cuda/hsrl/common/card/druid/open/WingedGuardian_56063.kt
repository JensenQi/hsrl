package tech.cuda.hsrl.common.card.druid.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class WingedGuardian_56063 : Card() {
    override val id = 56063
    override val name = "飞翼守护者"
    override val description = "<b>嘲讽，复生</b> 无法成为法术或英雄技能的目标。"
    override var cost: Int? = 7
    override var health: Int? = 8
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Druid
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "就算冰雪覆盖，我也不怕重来，我已不是那个懵懂的幼崽。"
    override val artist = "MAR Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/252da093e03b88f3ff6e88e892b433e2ee9c52ebf872db2367b14bbf203e9252.png"
}
