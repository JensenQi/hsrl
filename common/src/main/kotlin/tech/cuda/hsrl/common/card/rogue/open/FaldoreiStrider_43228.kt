package tech.cuda.hsrl.common.card.rogue.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class FaldoreiStrider_43228 : Card() {
    override val id = 43228
    override val name = "法多雷突袭者"
    override val description = "<b>战吼：</b> 将三张伏击牌洗入你的牌库。 当抽到伏击牌时，召唤一只4/4的蜘蛛。"
    override var cost: Int? = 4
    override var health: Int? = 4
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.KoboldsCatacombs
    override val background = "到底哪个更可怕——是看到了蜘蛛，还是没看到蜘蛛，却知道它就躲在房间里的某个角落？"
    override val artist = "Tyler West Studio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1a83a530b189b30f1e6c55e21af7aeff9953ec2fe778ee0407e7fa657036e8b2.png"
}
