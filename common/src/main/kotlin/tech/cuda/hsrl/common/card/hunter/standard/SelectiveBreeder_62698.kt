package tech.cuda.hsrl.common.card.hunter.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SelectiveBreeder_62698 : Card() {
    override val id = 62698
    override val name = "选种饲养员"
    override val description = "<b>战吼：</b> 从你的牌库中<b>发现</b>一张野兽牌的复制。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 1
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Hunter
    override val cardSet = CardSet.Core
    override val background = "他选的都是最好的，看看这只会笑的大猫就知道了！"
    override val artist = "Vladimir Kafanov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/3d22132815d9086e048e6f511d6be93c7594942053b9583d072c1945c100a08b.png"
}
