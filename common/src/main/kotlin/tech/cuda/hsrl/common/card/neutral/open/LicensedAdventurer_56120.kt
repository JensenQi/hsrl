package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class LicensedAdventurer_56120 : Card() {
    override val id = 56120
    override val name = "资深探险者"
    override val description = "<b>战吼：</b>如果你控制一个<b>任务</b>，则将一个幸运币置入你的手牌。"
    override var cost: Int? = 2
    override var health: Int? = 2
    override var attack: Int? = 3
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.GalakrondsAwakening
    override val background = "“想搞什么宝贝，告诉我大概方位，剩下的就交给我了！没有我砸不坏的！”"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/ab7333390bb167e65de08afe0f419dd86b9187e08420549ce645181793b939a4.png"
}
