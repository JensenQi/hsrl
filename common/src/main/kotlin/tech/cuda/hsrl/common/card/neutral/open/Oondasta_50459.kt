package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Oondasta_50459 : Card() {
    override val id = 50459
    override val name = "乌达斯塔"
    override val description = "<b>突袭</b> <b>超杀：</b>从你的手牌中召唤一个野兽。"
    override var cost: Int? = 9
    override var health: Int? = 7
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Beast
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "在巨魔文化中，魔暴龙装扮师是种饱受尊敬的职业，只是人员流失率有点居高不下。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/c7eab3f2ecd1cdcc4b27d4ef874abb394724b2db0cb9cb9659bc3376bbc6316f.png"
}
