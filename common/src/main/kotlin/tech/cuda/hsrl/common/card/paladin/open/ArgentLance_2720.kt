package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArgentLance_2720 : Card() {
    override val id = 2720
    override val name = "白银之枪"
    override val description = "<b>战吼：</b>揭示双方牌库里的一张随从牌。如果你的牌法力值消耗较大，+1耐久度。"
    override var cost: Int? = 2
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Tgt
    override val background = "条纹布包装让它看起来像一支拐杖糖，但我们可不推荐你去“尝一尝”。"
    override val artist = "Joe Wilson"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5ac1ef5c5fcc0077950ae9ddd5821a3e23704702a67fc74d232d3c054ef1d8bb.png"
}
