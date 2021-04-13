package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class DementedFrostcaller_38412 : Card() {
    override val id = 38412
    override val name = "癫狂的唤冰者"
    override val description = "在你施放一个法术后，随机<b>冻结</b> 一个敌人。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Wotog
    override val background = "千万别带他去任何派对，因为他的冷场天赋太过强大……"
    override val artist = "Arthur Gimaldinov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7cce6df3a5a24a0626a28f5d958cffe4929bc5de4d27e445f9f68a59344fb7da.png"
}
