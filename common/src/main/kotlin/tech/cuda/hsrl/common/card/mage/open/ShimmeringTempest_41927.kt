package tech.cuda.hsrl.common.card.mage.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ShimmeringTempest_41927 : Card() {
    override val id = 41927
    override val name = "活体风暴"
    override val description = "<b>亡语：</b> 随机将一张法师法术牌置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.Ungoro
    override val background = "他最讨厌被肯瑞托的法师拿来当派对的灯光特效。"
    override val artist = "Luca Zontini"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/8463058296b5a9281c41838b08ac5f564627468db64afaab69fbf515b6fc2fbc.png"
}
