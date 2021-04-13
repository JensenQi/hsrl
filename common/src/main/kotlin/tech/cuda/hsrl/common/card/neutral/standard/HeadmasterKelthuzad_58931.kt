package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HeadmasterKelthuzad_58931 : Card() {
    override val id = 58931
    override val name = "校长克尔苏加德"
    override val description = "<b>法术迸发：</b>如果法术消灭了任意随从，召唤被消灭的随从。"
    override var cost: Int? = 5
    override var health: Int? = 6
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "“你想知道我的秘密，嗯？我在长袍的袖子里藏了一点金枪鱼，他最喜欢那个了。哦，你说那些复活的死者？那只是小事，小事。”"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5e753d13f70cbfdbc1444ea3a3fe90b6b47f316cfd7a5a026714e2de56471631.png"
}
