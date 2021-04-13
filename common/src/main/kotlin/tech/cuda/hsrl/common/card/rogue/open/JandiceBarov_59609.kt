package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JandiceBarov_59609 : Card() {
    override val id = 59609
    override val name = "詹迪斯·巴罗夫"
    override val description = "<b>战吼：</b>召唤两个法力值消耗为（5）的随从。秘密选择其中一个，使其在受到伤害时死亡。"
    override var cost: Int? = 5
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "整座学园都属于她的父母。所以她当然要和学生们好好玩玩！"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/87c4901e89beafa8ba714cb1ce0c9ffd90d3e9803ed6daaf9f29dd4ac293b89c.png"
}
