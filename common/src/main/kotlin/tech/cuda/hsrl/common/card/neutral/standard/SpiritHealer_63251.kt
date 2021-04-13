package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SpiritHealer_63251 : Card() {
    override val id = 63251
    override val name = "灵魂医者"
    override val description = "在你施放一个神圣法术后，随机使一个友方随从获得+2生命值。"
    override var cost: Int? = 4
    override var health: Int? = 6
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "“又是你？我不是已经告诉你了吗，同时挑战所有野猪人会有什么后果。”"
    override val artist = "Yaohua Xu"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/d7ca34371f6214633e626a02ce8d25d19b30c388b0005592fbdb0cccecbc02f1.png"
}
