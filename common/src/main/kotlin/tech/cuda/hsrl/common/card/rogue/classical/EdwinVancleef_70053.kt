package tech.cuda.hsrl.common.card.rogue.classical

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class EdwinVancleef_70053 : Card() {
    override val id = 70053
    override val name = "艾德温·范克里夫"
    override val description = "<b>连击：</b>在本回合中，使用此牌前每使用一张其他牌，便获得+2/+2。"
    override var cost: Int? = 3
    override var health: Int? = 2
    override var attack: Int? = 2
    
    override val isClassic = true
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Rogue
    override val cardSet = CardSet.ClassicCards
    override val background = "他领导石匠协会重建了暴风城，而当贵族们拒绝支付工钱的时候，他将领导迪菲亚兄弟会，嗯，拆掉暴风城。"
    override val artist = "Efrem Palacios"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/2f9181fa41f324cfe42f5a09e8c6c1439c1b6e6893e3fa0f29eebe422b5fd5b4.png"
}
