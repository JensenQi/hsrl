package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HordeOperative_63726 : Card() {
    override val id = 63726
    override val name = "部落特工"
    override val description = "<b>战吼：</b>复制你对手的<b>奥秘</b>并置入战场。"
    override var cost: Int? = 3
    override var health: Int? = 4
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“我们都有秘密，不过你的秘密现在也是我的了。”"
    override val artist = "Adam Byrne"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ec161d8b67fe727c4d66f46376ac583a7c42e307db4e40bae3617972d0fb4a94.png"
}
