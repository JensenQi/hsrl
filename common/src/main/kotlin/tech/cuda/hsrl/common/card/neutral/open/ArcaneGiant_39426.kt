package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ArcaneGiant_39426 : Card() {
    override val id = 39426
    override val name = "奥术巨人"
    override val description = "在本局对战中，你每施放一个法术就会使 法力值消耗减少（1）点。"
    override var cost: Int? = 12
    override var health: Int? = 8
    override var attack: Int? = 8
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Epic
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Karazhan
    override val background = "表面上他们是被卡拉赞的魔法吸引所至，但实际上他们的最爱是莫罗斯的厨艺。"
    override val artist = "Dan Scott"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/b565af8679d36b0fd2ecbbf363796e8525e74deb0b20376ae4e4e5610cbffd52.png"
}
