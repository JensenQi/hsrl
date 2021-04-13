package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class RumbletuskShaker_50427 : Card() {
    override val id = 50427
    override val name = "暴牙震颤者"
    override val description = "<b>亡语：</b>召唤一个3/2的暴牙破坏者。"
    override var cost: Int? = 4
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "当当当，三个巨魔坐浴缸。要问他们都是谁？震颤破坏和送葬。三人全都奔向我，看来小命要遭殃。"
    override val artist = "Sam Nielson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4395de47e0e8695154e1e238473af7c540db667f1f5f47f617cbb179cd92f54c.png"
}
