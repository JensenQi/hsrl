package tech.cuda.hsrl.common.card.hunter.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Emeriss_46678 : Card() {
    override val id = 46678
    override val name = "艾莫莉丝"
    override val description = "<b>战吼：</b>使你手牌中所有随从牌的攻击力和生命值翻倍。"
    override var cost: Int? = 10
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.TheWitchwood
    override val background = "快来尝尝这腐烂的蘑菇吧，鸡肉味的！"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7a25a9c3773801cc909451290ab0c78bd645f861802636a1465a0066fe86d6b5.png"
}
