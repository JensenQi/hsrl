package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class SelflessHero_38740 : Card() {
    override val id = 38740
    override val name = "无私的英雄"
    override val description = "<b>亡语：</b>随机使一个友方随从获得<b>圣盾</b>。"
    override var cost: Int? = 1
    override var health: Int? = 1
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Rare
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.Wotog
    override val background = "“别担心，即便我倒下了，也会祝福你们。向着胜利……前进！”"
    override val artist = "Rafael Zanchetin"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/af9661eb5475fb44ed90853b6f6e64e67901fb2bfbdeb35cfdc0900eec669750.png"
}
