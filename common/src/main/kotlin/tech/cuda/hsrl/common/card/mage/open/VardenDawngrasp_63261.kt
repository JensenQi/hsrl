package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class VardenDawngrasp_63261 : Card() {
    override val id = 63261
    override val name = "瓦尔登·晨拥"
    override val description = "<b>战吼：</b><b>冻结</b>所有敌方随从。如果敌方随从已被<b>冻结</b>，则改为对其造成4点伤害。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.ForgedInTheBarrens
    override val background = "瓦尔登·晨拥可以驱使火焰，召唤冰暴，打个响指就能把一个暗夜精灵变成绵羊。当你了解到了现实世界的多元化，种种世俗的标签便不值一提。"
    override val artist = "Arthur Bozonnet"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b85d2cb89fca153cab6776bd8c6345469b6a9c4f58559216a5f6fe07a6893257.png"
}
