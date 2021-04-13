package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SnapjawShellfighter_50437 : Card() {
    override val id = 50437
    override val name = "钳嘴龟盾卫"
    override val description = "每当相邻的随从受到伤害，便会由该随从来承担。"
    override var cost: Int? = 5
    override var health: Int? = 8
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "不不不，那个<i>小龟</i>才是盾卫。"
    override val artist = "Matt Dixon"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/e53a317126ae6b704b878df0df1149ee27ffff1959aaecc42b25748b9d999ddc.png"
}
