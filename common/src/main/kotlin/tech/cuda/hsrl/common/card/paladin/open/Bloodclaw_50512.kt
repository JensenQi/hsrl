package tech.cuda.hsrl.common.card.paladin.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class Bloodclaw_50512 : Card() {
    override val id = 50512
    override val name = "血爪"
    override val description = "<b>战吼：</b>对你的英雄造成5点伤害。"
    override var cost: Int? = 1
    override var health: Int? = null
    override var attack: Int? = 2
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Weapon
    override val rarity = CardRarity.Common
    override val cardClass = CardClass.Paladin
    override val cardSet = CardSet.RastakhansRumble
    override val background = "快使用*哎呀*……血爪，哼哼哈*哎呀*嘿！"
    override val artist = "Akkapoj T."
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/6e5efdf58bd3dd85764f9dd9577be2583d5213c2e79c83bdc429533af946f81e.png"
}
