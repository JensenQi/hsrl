package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TuskarrFisherman_42775 : Card() {
    override val id = 42775
    override val name = "海象人渔夫"
    override val description = "<b>战吼：</b>使一个友方随从获得<b>法术伤害+1</b>。"
    override var cost: Int? = 2
    override var health: Int? = 3
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Kotf
    override val background = "如果你给他500条鱼，他会给你这根精致的卡鲁亚克鱼竿。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/96a3e596a084fb4f8653d1db6f9ebe26667f9060f53cdacbe60b8222878921cf.png"
}
