package tech.cuda.hsrl.common.card.neutral.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class MaievShadowsong_57197 : Card() {
    override val id = 57197
    override val name = "玛维·影歌"
    override val description = "<b>战吼：</b> 选择一个随从。使其<b>休眠</b>两回合。"
    override var cost: Int? = 4
    override var health: Int? = 3
    override var attack: Int? = 4
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.AshesOfOutland
    override val background = "直接投入恶魔监狱。无法攻击随从，无法收取法力水晶。"
    override val artist = "James Ryman"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/1199d388a03b3a41bee01ae0537149a8af397fd677c1b7a5edaba99338cbd9b8.png"
}
