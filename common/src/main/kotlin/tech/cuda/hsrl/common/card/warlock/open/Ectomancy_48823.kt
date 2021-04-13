package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Ectomancy_48823 : Card() {
    override val id = 48823
    override val name = "炼魂术"
    override val description = "召唤你控制的所有恶魔的复制。"
    override var cost: Int? = 6
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.BoomsdayProject
    override val background = "'泽里克！滚出我的实验室！'"
    override val artist = "Jerry Mascho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/bc4079da03bb2754b56c1288733701ad51514fecd4045e4b08c186e78da90932.png"
}
