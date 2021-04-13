package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Stalagg_1796 : Card() {
    override val id = 1796
    override val name = "斯塔拉格"
    override val description = "<b>亡语：</b>如果费尔根也在本局对战中死亡，召唤塔迪乌斯。"
    override var cost: Int? = 5
    override var health: Int? = 4
    override var attack: Int? = 7
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Naxx
    override val background = "斯塔拉格想要亲自填写自己的卡牌趣文。“斯塔拉格棒极了！”"
    override val artist = "Dany Orizio"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/425058e80bfb39b1174876b42e9ce65cad70d67a486d5a95abeb610b8a689f10.png"
}
