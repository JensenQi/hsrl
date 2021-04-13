package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class TirionFordring_890 : Card() {
    override val id = 890
    override val name = "提里奥·弗丁"
    override val description = "<b>圣盾</b>，<b>嘲讽</b>，<b>亡语：</b>装备一把5/3的 灰烬使者。"
    override var cost: Int? = 8
    override var health: Int? = 6
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Legacy3
    override val background = "如果你还没听过《提里奥·弗丁主题曲》，那是因为它还没被谱写出来。"
    override val artist = "Brom"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/9deffa52e7b9a85c95bbe6422270ba8b2ee816df1d1eadebd14777fc86bb4592.png"
}
