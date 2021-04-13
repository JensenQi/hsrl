package tech.cuda.hsrl.common.card.warlock.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Tickatus_61646 : Card() {
    override val id = 61646
    override val name = "提克特斯"
    override val description = "<b>战吼：</b>移除你的牌库顶的五张牌。<b>腐蚀：</b>改为对手的牌库。"
    override var cost: Int? = 6
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Demon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Warlock
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“奖券，卡牌……全都过！期！了！”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/770db3e77dea31602ca6a9227f76d5e04f7bff8353a802a9fc40b5551a4754d3.png"
}
