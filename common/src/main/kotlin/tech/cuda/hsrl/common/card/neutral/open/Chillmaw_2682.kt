package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Chillmaw_2682 : Card() {
    override val id = 2682
    override val name = "冰喉"
    override val description = "<b>嘲讽，亡语：</b> 如果你的手牌中有龙牌，则对所有随从造成3点伤害。"
    override var cost: Int? = 7
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "冰喉一心想要毁掉锦标赛。至于原因，都是因为那些吵闹个不停的熊孩子们！"
    override val artist = "Raymond Swanland"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/948d55d4fb413602212558e1b13b8a04f70ff10bedc7d55d3ac43f83441bd77c.png"
}
