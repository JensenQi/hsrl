package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Dragonbane_55303 : Card() {
    override val id = 55303
    override val name = "灭龙弩炮"
    override val description = "在你使用你的英雄技能后，随机对一个敌人造成5点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 5
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Mech
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.DescentOfDragons
    override val background = "*砰！*“那个不是龙！” *砰！*“那个也不是龙！”"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/f31f49f226c09ec08f184fbd3263a7a1c565739726d163250d4fc754062d3bc2.png"
}
