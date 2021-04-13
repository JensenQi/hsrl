package tech.cuda.hsrl.common.card.mage.standard

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class ConfectionCyclone_61176 : Card() {
    override val id = 61176
    override val name = "甜点飓风"
    override val description = "<b>战吼：</b>将两张1/2的甜蜜元素置入你的 手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = true

    override val minionType = MinionType.Elemental
    override val type = CardType.Minion
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Mage
    override val cardSet = CardSet.MadnessAtTheDarkmoonFaire
    override val background = "“我以为会是沙漠元素，结果只是砂糖？”"
    override val artist = "Anton Zemskov"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/7a603cfcb5a9645b4525dc45c077851ae950c59ecaf3030dcfc076afff963b6b.png"
}
