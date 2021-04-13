package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Scaleworm_47241 : Card() {
    override val id = 47241
    override val name = "巨鳞蠕虫"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，便获得+1攻击力和<b>突袭</b>。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.TheWitchwood
    override val background = "当地美食，跟香蕉是同样的吃法。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/84bbc3845179d3de836e9be28707d0713f662b69267b0f44310fed52093a6b27.png"
}
