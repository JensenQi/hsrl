package tech.cuda.hsrl.common.card.neutral.open

import tech.cuda.hsrl.common.card.Card
import tech.cuda.hsrl.common.enum.*
 
class HakkarTheSoulflayer_50454 : Card() {
    override val id = 50454
    override val name = "夺灵者哈卡"
    override val description = "<b>亡语：</b>将一张“堕落之血”分别洗入双方玩家的牌库。"
    override var cost: Int? = 10
    override var health: Int? = 6
    override var attack: Int? = 9
    
    override val isClassic = false
    override val isStandard = false

    override val minionType: MinionType? = null
    override val type = CardType.Minion
    override val rarity = CardRarity.Legendary
    override val cardClass = CardClass.Neutral
    override val cardSet = CardSet.RastakhansRumble
    override val background = "请注意：感染了堕落之血的角色请不要前往任何主城！"
    override val artist = "Izzy Hoover"
    override val image = "https://hearthstone.nosdn.127.net/hearthstone/a36765226d64cf7a07ab88ae31f614447da5b4ae5c43794bf2a33732b55a0eaa.png"
}
