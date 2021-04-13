package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class JusticarTrueheart_2736 : Card() {
    override val id = 2736
    override val name = "裁决者图哈特"
    override val description = "<b>战吼：</b>以更强的英雄技能来替换你的初始英雄技能。"
    override var cost: Int? = 6
    override var health: Int? = 3
    override var attack: Int? = 6
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.Tgt
    override val background = "英雄技能2.0升级版，面向所有职业。"
    override val artist = "Jomaro Kindred"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/eaa27579318bd240162b98e149c4a9aee983cc87d195a989a2430ae43725d323.png"
}
