package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class StewardOfDarkshire_38911 : Card() {
    override val id = 38911
    override val name = "夜色镇执法官"
    override val description = "每当你召唤一个生命值为1的随从，便使其获得<b>圣盾</b>。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Wotog
    override val background = "大量优质圣盾批发价甩卖，要的带价密。"
    override val artist = "Phroilan Gardner"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/5b3b755c624c459c32d92fe0c4ce45f5a584bfc19623787c7aac16d01162dce1.png"
}
