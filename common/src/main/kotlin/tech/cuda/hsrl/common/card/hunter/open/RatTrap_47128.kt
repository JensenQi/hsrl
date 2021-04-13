package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RatTrap_47128 : Card() {
    override val id = 47128
    override val name = "捕鼠陷阱"
    override val description = "<b>奥秘：</b>当你的对手在一回合中使用三张牌后，召唤一只6/6的老鼠。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = null
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Spell
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.TheWitchwood
    override val background = "寻宠启事：若有人找到末日骇鼠，请归还给托瓦格尔国王！"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1fc2947f40d935474d618b9859bdf2f71087034f7e441ca06ff5105fd0c57f0d.png"
}
