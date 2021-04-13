package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MalygosTheSpellweaver_66869 : Card() {
    override val id = 66869
    override val name = "织法者玛里苟斯"
    override val description = "<b>战吼：</b> 抽取法术牌直到达到你的手牌上限。"
    override var cost: Int? = 9
    override var health: Int? = 12
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Core
    override val background = "多年之后，玛里苟斯决定允许凡人使用魔法。想用吗？那就全都给你！"
    override val artist = "Zoltan Boros"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/0b6696eec3c74c83b5c9096dd636efcae876300dba3a2e6a7a097ec9dabdfd37.png"
}
