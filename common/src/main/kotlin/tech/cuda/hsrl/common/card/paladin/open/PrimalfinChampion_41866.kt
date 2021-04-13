package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class PrimalfinChampion_41866 : Card() {
    override val id = 41866
    override val name = "蛮鱼勇士"
    override val description = "<b>亡语：</b>将你施放在该随从身上的所有法术移回你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Murloc
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Ungoro
    override val background = "怎么，你想要回你的东西？除非我死了！"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d7c82f80de29bfe32e467faebfb96d1727c139aaab566bad014c76d23f3d07b5.png"
}
