package tech.cuda.hsrl.common.card.shaman.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class InstructorFireheart_59164 : Card() {
    override val id = 59164
    override val name = "导师火心"
    override val description = "<b>战吼：</b><b>发现</b>一张法力值消耗大于或等于（1）点的法术牌。如果你在本回合使用这张法术牌，重复此效果。"
    override var cost: Int? = 3
    override var health: Int? = 3
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Shaman
    override val cardSet = CardSet.ScholomanceAcademy
    override val background = "当心中的火焰燃起，就连死亡也阻止不了你。"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/4aba561a24cc9a08340f6e474f71f032736bfb0f6cec65162b44a87d65dd68f7.png"
}
