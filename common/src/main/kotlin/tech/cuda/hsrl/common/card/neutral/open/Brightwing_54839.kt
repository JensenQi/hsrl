package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Brightwing_54839 : Card() {
    override val id = 54839
    override val name = "光明之翼"
    override val description = "<b>战吼：</b>随机将一张<b>传说</b>随从牌置入你的 手牌。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Dragon
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Legacy1635
    override val background = "小精灵龙一般是由糖、香料和无数个疯狂的副作用所组成的。"
    override val artist = "Jerry Mascho"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b213d4fefa0b1aae0e11a331e62c177e760377a589e89e6859e9eaff84202af0.png"
}
