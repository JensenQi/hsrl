package tech.cuda.hsrl.common.card.priest.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ClericOfScales_56088 : Card() {
    override val id = 56088
    override val name = "龙鳞祭司"
    override val description = "<b>战吼：</b>如果你的手牌中有龙牌，便<b>发现</b>你牌库中的一张法术牌。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Priest
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "手牌中没有龙牌的时候能把人急死。"
    override val artist = "Maria Trepalina"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c719e2bad9d5667d5b406ebc21bbb0bb5f60eb88aae400ee222e46909e5accaa.png"
}
