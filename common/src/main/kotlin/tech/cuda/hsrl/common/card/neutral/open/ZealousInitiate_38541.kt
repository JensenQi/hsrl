package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ZealousInitiate_38541 : Card() {
    override val id = 38541
    override val name = "狂热的新兵"
    override val description = "<b>亡语：</b>随机使一个友方随从获得+1/+1。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Wotog
    override val background = "嘿，新来的！你得先冷静下来做好自己的本职工作。那么现在你要做的就是去送死，好让你的队友增强那么一点点。"
    override val artist = "Cole Eastburn"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4cb0df49d0fd028175a704252d72b79b88ddb4f737d6230c4f1197b3499c517e.png"
}
